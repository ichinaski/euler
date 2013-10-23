(ns euler.p007
  (:require [euler.p003 :refer [prime?]]))


; 10001st prime
; -------------
;
; By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
; What is the 10001st prime number?

(defn euler-7 []
  (first (drop 10000 (filter prime?
                             (drop 1 (range))))))
