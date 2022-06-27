const express = require("express");

const app = express();

//app.set("view engine", "ejs");

app.listen(3000, () => {
    console.log('Server rodando na porta 3000')
});