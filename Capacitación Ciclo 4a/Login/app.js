//Llamando liberias y creando instancia de cada una
const express = require('express');
const path = require('path');
const bodyParser = require('body-parser')
const app = express();

const bcrypt = require('bcrypt');
const mongoose = require('mongoose');

//trayendo js que maneja el modelo de usuario
const user = require('./models/user.js');

//activando el conversor de cuerpo para los archivos json
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));

//apuntando a la carpeta donde estan los activos estaticos y donde esta bootstrap
app.use(express.static(path.join(__dirname, 'public')));
app.use('/css', express.static(__dirname + '/node_modules/bootstrap/dist/css'));

//constante conteniendo la url de la base de datos
const mongo_uri = 'mongodb://localhost:27017/tiendalostiburones'

//realizando la conexión a mongo, y logeando los fallos
mongoose.connect(mongo_uri, function (err) {
    if (err) {
        console.log('Inicia Log de errores de Mongo');
        throw err;
        console.log('Finaliza Log de errores de Mongo');
    }
    else {
        console.log('se conectó a ${mongo_uri}');
    }
});

//url de api tipo POST que permite registrar un usuario 
app.route('/register')
    .get(function (req, res) {
        res.send('obteniendo');
    })
    .post(function (req, res) {
        const { username, password } = req.body;
        console.log('Entra a metodo post/register');
        //creando instancia de usuario    
        const User = new user({ username, password });

        //guardando en base de datos el usuario, si falla lanza un 500
        console.log('Declara variable user');
        User.save(err => {
            if (err) {
                res.redirect(301,"/errors/userregistererror.html");
                //res.status(500).send('Error al registrar usuario');
            }
            else {
                res.status(200).send('Usuario Registrado');
            }
        });
    })
    .put(function (req, res) {
        res.send('Actualiza');
    });


//url de api tipo POST que permite confirmar la existencia de un usuario y autenticar
app.post('/authenticate', (req, res) => {
    const { username, password } = req.body;
    //busque dentro de los usuarios aquel que tenga dicho username
    user.findOne({ username }, (err, user) => {
        if (err) {
            res.status(500).send('Error al autenticar usuario');
        } else if (!user) {
            res.status(500).send('El usuario no existe');
        } else {
            user.isCorrectPassword(password, (err, result) => {

                if (err) {
                    res.status(500).send('Error al autenticar');
                } else if (result) {
                    res.status(200).send('Usuario logueado correctamente');
                } else {
                    res.status(500).send('usuario o clave incorrecta');
                }

            });

        }
    });
});


//abriendo aplicación en el puerto designado
app.listen(3000, () => {
    console.log('Servidor Inicia puerto 3000');
})


module.exports = app;