function add(x, y) {
    alert (x + y);
}

function substract(x, y) {
    alert ( x - y);
}

function multiply(x, y) {
    alert ( x * y);
}

function divide(x, y) {
    if (y == 0) {
        showMessage('No se puede dividir por cero');
    }
    else {
        alert (x / y);
    }
}

exports.add = add;
exports.substract = substract;
exports.divide = divide;
exports.multiply = multiply;