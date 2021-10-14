function add(x, y) {
    return x + y;
}

function substract(x, y) {
    return x - y;
}

function multiply(x, y) {
    return x * y;
}

function divide(x, y) {
    if (y == 0) {
        showMessague('No se puede dividir por cero');
    }
    else {
        return x / y;
    }
}

exports.add = add;
exports.substract = substract;
exports.divide = divide;
exports.multiply = multiply;