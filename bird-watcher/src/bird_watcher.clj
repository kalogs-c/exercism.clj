(ns bird-watcher)

(def last-week [0 2 5 3 7 8 4])

(defn today [birds]
  (last birds)
  )

(defn inc-bird [birds]
  (def last-index (- (count birds) 1))
  (assoc birds last-index (+ (last birds) 1))
  )

(defn day-without-birds? [birds]
  (not (every? pos? birds))
  )

(defn n-days-count [birds n]
  (reduce + (take n birds))
  )

(defn busy-days [birds]
  (count (filter #(> % 4) birds))
  )

(defn odd-week? [birds]
  (= [1 0 1 0 1 0 1] birds)
  )
