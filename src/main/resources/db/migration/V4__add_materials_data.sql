DROP TABLE IF EXISTS materials;

CREATE TABLE materials (
    id SERIAL PRIMARY KEY,
    code VARCHAR(20) UNIQUE NOT NULL,
    name VARCHAR(100) UNIQUE NOT NULL,
    type VARCHAR(50),
    description VARCHAR(100) NOT NULL,
    notes VARCHAR(200)
);

INSERT INTO materials (code, name, type, description, notes) VALUES
('MAT-001', 'Leviathan Grand', 'Grand Piano', 'Final product', 'Ready for sales'),
('MAT-002', 'The Drowned Upright', 'Upright Piano', 'Final product', 'Ready for sales'),
('MAT-003', 'The Abyssal Spinet', 'Spinet Piano', 'Final product', 'Ready for sales'),
('MAT-004', 'Cursed Drift Wood', 'Raw Material', 'Dredged from the deep, essential for piano casing', 'Used in all final products'),
('MAT-005', 'Whale Bone Keys', 'Raw Material', 'For authentic eldritch resonance and key durability', 'Used in all final products'),
('MAT-006', 'Eldritch Strings', 'Raw Material', 'Forged from deep-sea metal alloys for unearthly tones', 'Used in all final products'),
('MAT-007', 'Occult Pedals', 'Component', 'Enchanted pedals that sustain otherworldly vibrations', 'Used in all final products'),
('MAT-008', 'Whale Blubber Polish', 'Component', 'Polish infused with forbidden runes for a sinister sheen', 'Used in all final products'),
('MAT-009', 'Shoggoth Felt', 'Raw Material', 'Used in hammers for eerie sound dampening', 'Used in all final products');