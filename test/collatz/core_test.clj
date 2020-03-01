(ns collatz.core-test
  (:require [clojure.test :refer :all]
            [collatz.core :refer :all]))

(deftest collatz-seq-test
  (testing "collatz-seq produces a collatz sequence"
    (is (= (take 20 (collatz-seq 11)) '(11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 4 2 1 4 2)))))

(deftest collatz-stop-at-1-test
  (testing "collatz-stop-at-1 stops at 1 for a given sequence"
    (is (= (collatz-stop-at-1 10) '(10 5 16 8 4 2 1)))))