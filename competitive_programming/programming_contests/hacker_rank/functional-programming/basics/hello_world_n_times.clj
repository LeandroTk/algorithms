;; https://www.hackerrank.com/challenges/fp-hello-world-n-times/problem

(defn greater-than-zero? [n] (> n 0))

(defn hello-word-n-times
  [n]
  (if (greater-than-zero? n)
    (do (println "Hello World")
        (hello-word-n-times (dec n)))))

(hello-word-n-times 4)
