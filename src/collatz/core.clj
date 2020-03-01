(ns collatz.core
  (:gen-class))

(defn collatz [x]
  (if (even? x) (/ x 2) (+ (* x 3) 1)))

(defn collatz-seq [x]
  (lazy-cat [x] (collatz-seq (collatz x))))

;; produce the collatz sequence and stop at 1
(defn collatz-stop-at-1 [x]
  (let [cseq (collatz-seq x)]
    (loop [fseq '() cseq cseq]
      (if (= (first cseq) 1)
        (reverse (conj fseq 1))
        (recur (conj fseq (first cseq)) (rest cseq))))))
