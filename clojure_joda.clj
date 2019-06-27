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
