;not sure why this doesn't work
(count(map (select-keys ["merchant"] last-transactions)))

;but this works
(count(map #(select-keys % ["merchant"]) last-transactions))


(select-keys {"merchant" "Kabum" "active" "true"} ["merchant"])
(every? (select-keys [{"merchant" "Kabum" "active" "true"}{"merchant" "Kabum" "active" "true"}] ["merchant"]))
(select-keys last-transactions ["merchant"])

(frequencies [{"a" 1 "b" 1}{"a" 1 "b" 2}])
(count (distinct last-transactions))
(frequencies (select-keys last-transactions ["merchant"]))

(every? [t last-transactions] (class t))

(every? [t last-transactions] (select-keys t ["merchan"]))
(every? #{:} last-transactions)
(every? #{1} (vals {:a 1 :b 2}))

(vals [{"a" 1 "b" 2}])

;(def mynum 10)
;(defn add [n]
;  (+ n 10))
;(add mynum)
;(amount-above-limit? {:amount 10} {:limit 100})
(class transaction)
(class last-transactions)
;(def transaction (-main))
(println account)
(println transaction)
(println last-transactions)

(class nil)


(def trans (map #(select-keys % ["merchant"]) last-transactions))
(map #(select-keys % ["merchant"]) last-transactions)

(map #(select-values % ["merchant"]) last-transactions)

(map #(select-values % ["merchant"]) last-transactions)
(frequencies (map #(select-values % ["merchant"]) last-transactions))

(group-by #{0} d)
(second (first d))

(some #(> 10 %) (vals d))
(every? #(= 2 %) (vals d))

(some #(when (> % 10) %) (vals d))

(every? #(compare 10 %) (vals d))



(def d (frequencies (map #(select-values % ["merchant"]) last-transactions)))
(str d)
(get-in '{"a" 1} ["a"])
(array-map d)
(some #{2} ["a" 1 "b" 2])
(class d)
(get d first)

(class(frequencies (map #(select-values % ["merchant"]) last-transactions)))

(count(map #(select-keys % ["merchant"]) last-transactions))
