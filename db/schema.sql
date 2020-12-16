CREATE TABLE post (
    id SERIAL PRIMARY KEY,
    name TEXT
);

CREATE TABLE candidate (
    id SERIAL PRIMARY KEY,
    name TEXT
);

ALTER TABLE candidate ADD COLUMN photoId int references photo(id);

CREATE TABLE photo (
    id SERIAL PRIMARY KEY,
    title TEXT
);