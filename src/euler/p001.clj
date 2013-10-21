(ns euler.p001)

; 1 - Multiples of 3 and 5
; Sum the multiples of 3 and 5 below 1000
(defn euler-1 []
  (reduce + (filter #(or (zero? (mod % 3))
                         (zero? (mod % 5)))
                    (range 1000))))
