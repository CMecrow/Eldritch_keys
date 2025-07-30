DROP TABLE IF EXISTS vendors;

CREATE TABLE vendors (
    id SERIAL PRIMARY KEY,
    code VARCHAR(20) UNIQUE NOT NULL,
    name VARCHAR(100) UNIQUE NOT NULL,
    location VARCHAR(100),
    notes VARCHAR(200)
);

INSERT INTO vendors (code, name, location, notes) VALUES
('V100', 'Innsmouth Dredgers', 'Innsmouth, Massachusetts', 'Wood Supplier'),
('V101', 'Cornish Whaling Corp', 'Cornwall, England', 'Whale Bone Supplier'),
('V102', 'Abyssal Alloy Works', 'R’lyeh Trench, Pacific Ocean', 'Eldritch String Supplier'),
('V103', 'The Pedal Coven', 'Innsmouth, Massachusetts', 'Occult Pedal Supplier'),
('V104', 'Blubber & Bone Ltd.', 'Kingsport, Massachusetts', 'Whale Blubber Supplier'),
('V105', 'Shoggoth Textiles', 'Arkham, Massachusetts', 'Shoggoth Felt Supplier');