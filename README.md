# collatz

Produces sequence of numbers according to the 3n + 1 rule (Collatz sequences).

## Usage

To produce an arbitrarily long sequence (including 4 2 1 repeating forever):

    $ (collatz-seq 10)
    $ ;; user=> (take 20 (collatz-seq 11))
    $ ;; (11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 4 2 1 4 2)

To produce a sequence that stops at 1:

    $ (collatz-stop-at-1 10)
    $ ;; (10 5 16 8 4 2 1)