const express = require('express');
const app = express();

const produtRouts = require('./api/routes/products');
const orderRouts = require('./api/routes/orders');

app.use('/products', produtRouts);
app.use('/orders', orderRouts);

module.exports = app;