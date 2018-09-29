
CREATE TABLE IF NOT EXISTS users (
    id SERIAL,
    email_address VARCHAR(255) NOT NULL,
    encrypted_password VARCHAR(255) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY (email_address)
)
