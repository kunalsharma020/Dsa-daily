const express = require("express");
const app = express();

app.use(express.json()); // body read karne ke liye

let todos = [];

// POST
app.post("/todos", (req, res) => {
  todos.push(req.body);
  res.json({ message: "Todo added", todos });
});

// GET
app.get("/todos", (req, res) => {
  res.json(todos);
});

// PUT
app.put("/todos/:index", (req, res) => {
  const i = req.params.index;
  todos[i] = req.body;
  res.json({ message: "Todo replaced", todos });
});

// PATCH
app.patch("/todos/:index", (req, res) => {
  const i = req.params.index;
  todos[i].task = req.body.task;
  res.json({ message: "Todo updated", todos });
});

// DELETE
app.delete("/todos/:index", (req, res) => {
  const i = req.params.index;
  todos.splice(i, 1);
  res.json({ message: "Todo deleted", todos });
});
app.listen(3000, () => {
  console.log("Server running on port 3000");
});