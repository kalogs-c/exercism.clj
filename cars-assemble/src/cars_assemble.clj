(ns cars-assemble)

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (def cars-produced (* 221 speed))
  (def rate 
    (float
      (cond (== 0 speed) 0
            (> 5 speed) 100
            (> 9 speed) 90
            (> 10 speed) 80
            (== 10 speed) 77)))

  (cond (= 0 rate) 0
        (= 100 rate) cars-produced
        :else (* rate (/ cars-produced 100)))
  )

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (int (/ (production-rate speed) 60))
  )
