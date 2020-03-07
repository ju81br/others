const express = require('express');
const mongoose = require('mongoose');
const routes = require('./routers');

const app = express();

mongoose.connect('mongodb+srv://sergio:sergio@cluster0-piqzz.mongodb.net/week10?retryWrites=true&w=majority', {
  useNewUrlParser: true,
  useUnifiedTopology: true,
});

app.use(express.json());
app.use(routes);


app.listen(3333);