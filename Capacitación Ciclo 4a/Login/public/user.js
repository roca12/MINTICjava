//cargando instancias de las liberias de manejo de mongo y de encriptación
const mongoose = require('mongoose');
const bcrypt = require('bcrypt');

//cantidad de ciclos de encriptacion usando salt
const saltRounds = 10;

//definiendo el esquema para los usuarios en el sistema
const UserSchema = new mongoose.Schema({
    //tipo,requerido,llaves secundarias
    //por defecto mongo asigna aleatoriamente la llave primaria
    username: { type: String, required: true, unique: true },
    password: { type: String, required: true }
});

//definiendo la funcion de guardado para nuevos registros
UserSchema.pre('save', function (next) {
    console.log('Entra a metodo Save');
    //si es nuevo registro o se esta modificando una columna
    if (this.isNew || this.isModified('password')) {
        const document = this;
        console.log('Entra a if save');
        //encriptando contraseña
        bcrypt.hash(document.password, saltRounds, (err, hashedPassword) => {
            if (err) {
                next(err);
            }
            else {
                document.password = hashedPassword;
                next();
            }

        });
    }
    else {
        next();
    }

});

//metodo de verificación de contraseña correcta
UserSchema.methods.isCorrectPassword = function (password, callback) {
    //compare la contraseña dada en el formulario contra la almacenada en base de datos
    bcrypt.compare(password, this.password, function (err, same) {
        if (err) {
            callback(err);
        }
        else {
            callback(err, same);
        }

    });
}

//exportando modulo para poderse usar en otros archivos
module.exports = mongoose.model('user', UserSchema);

