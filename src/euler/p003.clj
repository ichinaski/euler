(ns euler.p003)

; 3 - Largest Prime Factor
; Largest prime factor of 600851475143
(defn divisor? [number divisor]
  (zero? (rem number divisor)))

(defn prime? [number]
  (not-any? #(divisor? number %)
            (range 2 (Math/sqrt number))))

(defn euler-3
  ([] (euler-3 600851475143))

  ([number] (last (filter (fn [d] (divisor? number d))
                          (filter #(prime? %)
                                  (range 1 (Math/sqrt number)))))))
