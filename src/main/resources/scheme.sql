-- Elimina la tabla 'users' si ya existe para asegurar un inicio limpio
DROP TABLE IF EXISTS users;

-- Crea la tabla 'users' con los campos originales, adaptados para SQLite
CREATE TABLE users (
    id INTEGER PRIMARY KEY AUTOINCREMENT, -- Clave primaria autoincremental para SQLite
    name TEXT NOT NULL UNIQUE,          -- Nombre de usuario (TEXT es el tipo de cadena recomendado para SQLite), con restricción UNIQUE
    password TEXT NOT NULL           -- Contraseña hasheada (TEXT es el tipo de cadena recomendado para SQLite)
);


CREATE TABLE IF NOT EXISTS profesores (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  nombre     TEXT NOT NULL,
  apellido   TEXT NOT NULL,
  correo     TEXT NOT NULL,
  dni        TEXT NOT NULL UNIQUE
);