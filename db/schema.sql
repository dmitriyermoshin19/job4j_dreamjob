drop table if exists post;
CREATE TABLE post (
    id SERIAL PRIMARY KEY,
    name TEXT
);
drop table if exists candidate;
CREATE TABLE candidate (
    id SERIAL PRIMARY KEY,
    name TEXT,
    photo_Id int,
    city_id int
);

drop table if exists photo;
CREATE TABLE photo (
    id SERIAL PRIMARY KEY,
    title TEXT
);

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name TEXT,
    email TEXT,
    password TEXT
);

CREATE TABLE cities (
    id SERIAL PRIMARY KEY,
    nameCity TEXT
);
