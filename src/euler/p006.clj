(ns euler.p006)

; Sum square difference
; ---------------------
;
; The sum of the squares of the first ten natural numbers is,
; 1^2 + 2^2 + ... + 10^2 = 385
; 
; The square of the sum of the first ten natural numbers is,
; (1 + 2 + ... + 10)^2 = 55^2 = 3025
; 
; Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
; 
; Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

(defn euler-6[]
  (long (- (Math/pow (reduce + (range 1 101)) 
                     2); Square of the sum
           (reduce + (map #(Math/pow % 2) 
                          (range 1 101)))))); Sum of the squares
