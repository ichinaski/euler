(ns euler.p004)

; 4 - Largest Palindrome Product
; ------------------------------
;
; A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
; Find the largest palindrome made from the product of two 3-digit numbers.

(defn digit-count [number]
  (if-not (zero? number)
    (inc (int (Math/log10 number)))
    1));

(defn get-digit [number pos]
  "Given a number, return its digit in position pos"
  (let [size (digit-count number)
        head (long (/ number (Math/pow 10 (dec (- size pos)))))]; first pos digits
    (long (rem head 10))))

(defn palindrome? [number]
  (let [size (digit-count number)]
    (loop [index 0]
      (if (<= index (/ size 2))
        (if (= (get-digit number index)
               (get-digit number (- (dec size) index)))
            (recur (inc index))
            false)
        true))))

(defn euler-4 []
  (reduce max
          (filter palindrome?
                  (for [x (range 100 1000)
                        y (range 100 1000)]
                    (* x y)))))
