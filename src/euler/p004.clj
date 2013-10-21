(ns euler.p004)

; 4 - Largest Palindrome Product
; Largest palindrome product of two 3-digit numbers
(defn digitCount [number]
  (if-not (zero? number)
    (inc (int (Math/log10 number)))
    1));

(defn getDigit [number pos]
  "Given a number, return its digit in position pos"
  (let [size (digitCount number)
        head (long (/ number (Math/pow 10 (dec (- size pos)))))]; first pos digits
    (long (rem head 10))))

(defn palindrome? [number]
  "Given a number, return a list containing its digits"
  (let [size (digitCount number)]
    (loop [index 0]
      (if (<= index (/ size 2))
        (if (= (getDigit number index)
               (getDigit number (- (dec size) index)))
            (recur (inc index))
            false)
        true))))

(defn euler-4 []
  (reduce max
          (filter palindrome?
                  (for [x (range 100 1000)
                        y (range 100 1000)]
                    (* x y)))))
