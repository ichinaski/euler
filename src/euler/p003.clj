(ns euler.p003)

; 3 - Largest Prime Factor
; ------------------------
; 
; The prime factors of 13195 are 5, 7, 13 and 29.
; What is the largest prime factor of the number 600851475143?

(defn divisor? [number divisor]
  (zero? (rem number divisor)))

(defn prime? [number]
  (cond
    (> number 2) (not-any? #(divisor? number %)
                           (range 2 (inc (Math/sqrt number))))
    (= number 2) true
    :else        false))

(defn euler-3
  ([] (euler-3 600851475143))

  ([number] (last (filter #(divisor? number %)
                          (filter #(prime? %)
                                  (range 1 (Math/sqrt number)))))))
