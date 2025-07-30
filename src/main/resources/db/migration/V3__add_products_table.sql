DROP TABLE IF EXISTS products;

CREATE TABLE products (
    id SERIAL PRIMARY KEY,
    name varchar(50),
    description varchar(500),
    price INTEGER
);

INSERT INTO products (name, description, price) VALUES
('Leviathan Grand', 'Forged from weathered driftwood and crowned with keys carved from ancient whale bone, the Leviathan Grand looms like a beast of the deep. Its low notes rumble like distant thunder beneath the waves, and those who play it swear they feel the pull of unseen tides.', '18000'),
('The Drowned Upright', 'This upright piano, salvaged from the wreckage of forgotten storms, hums with a ghostly resonance. Its whale bone keys bear salt-stained etchings, and each chord lingers like a memory dragged up from the ocean floor.', '11000'),
('The Abyssal Spinet', 'Small enough to fit in a candlelit corner, the Abyssal Spinet is anything but harmless. Fashioned from driftwood bleached by moonlight and bound with silent shadows, it sings in tones that sound too old to belong to this world.', '8000');