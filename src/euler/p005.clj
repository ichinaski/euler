(ns euler.p005)

; 5 - Smallest Multiple
; Least common multiple of the numbers from 1 - 20

; Naive way of getting the LCM of 2 numbers
(defn lcm [x y]
  (loop [z x]
    (if (zero? (rem z y))
      z
      (recur (+ z x)))))

(defn euler-5 []
  (reduce lcm (range 1 21)))
