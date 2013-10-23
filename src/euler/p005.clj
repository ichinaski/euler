(ns euler.p005)

; 5 - Smallest Multiple
; ---------------------
;
; 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
; What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

; Naive way of getting the LCM of 2 numbers
(defn lcm [x y]
  (loop [z x]
    (if (zero? (rem z y))
      z
      (recur (+ z x)))))

(defn euler-5 []
  (reduce lcm (range 1 21)))
