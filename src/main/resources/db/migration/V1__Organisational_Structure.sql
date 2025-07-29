DROP TABLE IF EXISTS organisation;

CREATE TABLE organisation (
    id SERIAL PRIMARY KEY,
    scope varchar(50),
    code varchar(50),
    description varchar(100),
    notes varchar(200)
);