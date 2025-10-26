Diffie-Hellman Key Exchange (Java)

This project is a console-based Java implementation of the Diffie-Hellman shared secret key exchange algorithm. It demonstrates how two parties can independently generate a matching shared secret key over a public channel without exposing their private values.

Features

Prompts users for:

Base value (generator)

Modulo value (prime modulus)

Two participant names and private numbers

Computes:

Each participant’s public key using modular exponentiation

A shared secret for both parties

Verifies both participants compute the same shared secret

What This Demonstrates

This program models the core mathematics behind secure cryptographic key exchange used in protocols like TLS and end-to-end encryption. It shows that:

Even if an attacker sees the base, modulo, and public values, they still cannot derive the shared secret without knowing a private key.

Technologies Used

Java

Scanner for input handling

Math.pow for exponentiation + modular arithmetic

How to Run

Compile and run through a terminal or IDE:

javac Main.java
java Main


Then follow the prompts to generate keys and view the resulting shared secret.
