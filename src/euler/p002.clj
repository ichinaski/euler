(ns euler.p002)

; 2 - Even Fibonacci numbers
; Sum even numbers in the Fibonacci sequence below 4.000.000
(defn fibonacci [limit]
  (loop [fib [1] n 2];initial sequence and next number
    (if (< n limit)
      (recur (conj fib n)
             (+ n (last fib)))
      fib)))

(defn euler-2 []
  (reduce + (filter even?
                    (fibonacci 4000000))))
