(class (java.time.LocalDateTime/now))

(t/date-time 1986 10 14)
(t/hour (t/date-time 1986 10 14 22 11))
(t/minute (t/date-time 1986 10 14 22 10))
(t/date-time "2019-06-21T10:20:05.511Z")
(f/parse (f/formatters :date-time) "2019-06-21T10:20:05.511Z")
(f/parse (f/formatters :date-time-no-ms) "2013-02-20T17:24:33Z")



(def date1 (f/parse (f/formatters :date-time) "2019-06-21T10:20:05.511Z"))
(def date2 (f/parse (f/formatters :date-time) "2019-06-21T10:20:05.511Z"))
(t/within? 3 (date1) (date2))
(t/in-minutes (t/interval (date1) (date2)))

(class date1)

(t/within? (t/interval(t/date-time 1986)(t/date-time 1990))(t/date-time 1987))
(t/within? (t/interval date1 date2)(t/date-time 1987))

(class (t/date-time 1986))

(def mytimes (for [x last-transactions] (get-in x["time"])))

(for [x mytimes
      :let[dt (f/parse (f/formatters :date-time) x)]
      :let[dif (t/in-minutes(t/interval dt dt))]]
  dif)

(map #(select-values % ["merchant"]) last-transactions)
(println last-transactions)
(println transaction)
(println account)
(get-in transaction["time"])
(def deny (get-in account["denylist"]))
(class (get-in account["denylist"]))
(some #{"Almanara"} deny)

(java.time.LocalDateTime/now)

(def dts(map #(select-values % ["time"]) last-transactions))

(for [x dts
      :let[dt (f/parse (f/formatters :date-time) x)]
      :let[dif (t/in-minutes(t/interval dt dt))]]
  dif)


(class (map #(select-values % ["time"]) last-transactions))
(class (get-in transaction["time"]))
(class (java.time.LocalDateTime/now))

(t/date-time 1986 10 14)
(t/hour (t/date-time 1986 10 14 22 11))
(t/minute (t/date-time 1986 10 14 22 10))
(t/date-time "2019-06-21T10:20:05.511Z")
(f/parse (f/formatters :date-time) "2019-06-21T10:20:05.511Z")
(f/parse (f/formatters :date-time-no-ms) "2013-02-20T17:24:33Z")

(t/now)

(def date1 (f/parse (f/formatters :date-time) "2019-06-21T10:20:00.500Z"))
(def date2 (f/parse (f/formatters :date-time) "2019-06-21T10:22:00.500Z"))
(t/within? 3 (date1) (date2))
(t/in-minutes (t/interval date1 date2))

(class date1)

(t/within? (t/interval(t/date-time 1986)(t/date-time 1990))(t/date-time 1987))
(t/within? (t/interval date1 date2)(t/date-time 1987))

(t/in-minutes (t/interval date1 date2))
(> (t/in-minutes (t/interval date1 date2)) 3)
(class (t/date-time 1986))

(def times (map #(select-values % ["time"]) last-transactions))
(some #(when (> % 10) %) times)

(class times)
(doseq [t times] (> (t/in-minutes (t/interval date1 t)) 3))
(for [t times] (class t))
(some #(when (> (t/in-minutes (t/interval date1 %)) 3) )times)


(for [t times
      :let [now (t/now)]
      :let [dt (t/date-time t)]
      :let [interval (t/in-minutes (t/interval dt dt))]]
  interval)

(def t1 (first times))
(class t1)
(t/date-time t1)
(println t1)

(for [x '(-1 1 2) :when (< 0 x)]
         x)

(t/in-minutes (t/interval date2 (t/now)))
(t/now)        
(for [t times :when (< (t/in-minutes (t/interval t (t/now))) 3)]
  t)

(t/in-minutes(t/interval date1 date2))

(def interval (map (fn [d] (t/in-minutes(t/interval d (t/now))) times)))

(class interval)
(println interval)
(map (fn [d] (< (t/in-minutes (t/interval d (t/now))) 3)) times)

(map (fn [d] (inc (val x))) {:a 1 :b 2 :c 3})
(2 3 4)

(println last-transactions)
        (class last-transactions)
        (get-in last-transactions["time"])

