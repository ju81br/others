const express = require('express');
const app = express();
const morgan = require('morgan');

const produtRouts = require('./api/routes/products');
const orderRouts = require('./api/routes/orders');

app.use(morgan('dev'));

app.use('/products', produtRouts);
app.use('/orders', orderRouts);
//
app.use((req, res, next) => {
    const error = new Error('Not found!');
    error.status = 404;
    next(error);
});

//any other error
app.use((error, req, res, next) => {
    res.status(error.status || 500);
    res.json({
        error: {
            menssage: error.message
        }
    });
});

module.exports = app;