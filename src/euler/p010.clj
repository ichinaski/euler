(ns euler.p010
  (:require [euler.p003 :refer [prime?]]))

; Summation of primes
; -------------------
;
; The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
; Find the sum of all the primes below two million.

(defn euler-10 []
  (reduce + (filter prime?
                    (range 2000000))))
