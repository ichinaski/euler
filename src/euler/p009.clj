(ns euler.p009)

; Special Pythagorean triplet
; ---------------------------
;
;
; A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
; a^2 + b^2 = c^2
; 
; For example, 3^2 + 4^2 = 9 + 16 = 25 = 52.
; 
; There exists exactly one Pythagorean triplet for which a + b + c = 1000.
; Find the product abc.

; Deriving a + b + c = 1000 and a^2 + b^2 = c^2, we get that:
;     a = (500000 -1000b) / (1000 - b)
(defn f [b]
  (/ (- 500000 (* 1000 b))
     (- 1000 b)))

(defn euler-9 []
  (first (for [b (drop 1 (range))
               :let [a (f b)
                     c (- 1000 a b)]
               :when (integer? a)]
           (* a b c))))
