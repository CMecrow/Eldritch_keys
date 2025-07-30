DROP TABLE IF EXISTS customers;

CREATE TABLE customers (
    id SERIAL PRIMARY KEY,
    code VARCHAR(20) UNIQUE NOT NULL,
    name VARCHAR(100) NOT NULL,
    location VARCHAR(100),
    notes VARCHAR(200)
);

INSERT INTO customers (code, name, location, notes) VALUES
('CUS-001', 'Arkham Harmonies', 'Arkham, Massachusetts', 'Premier retailer of cursed grand pianos'),
('CUS-002', 'Innsmouth Instruments', 'Innsmouth, Massachusetts', 'Stocks eldritch uprights and specialty components'),
('CUS-003', 'Dunwich Music Emporium', 'Dunwich, Massachusetts', 'Known for their occult sheet music and pianos'),
('CUS-004', 'Kingsport Keys & Strings', 'Kingsport, Massachusetts', 'Focuses on high-end haunted grands for elite customers'),
('CUS-005', 'R’lyeh Deep Notes', 'Subaquatic Location – R’lyeh Trench', 'Exclusive distributor of abyssal pianos for cult clientele');
