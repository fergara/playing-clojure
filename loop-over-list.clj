
(def names '("Fernando", "Jonhy", "Rich"))
(def cars '("Ferrari", "Lamborgini", "BMW"))
(def cities '("New York", "Tokio", "Sao Paulo"))

(def addresses [:country "USA" :city "Los Angeles",
              :country "Japan" :city "Tokio"
              ])

(class names) ; --> PersistenceList
(class addresses) ; --> PersistentVector

(map println names)

; "println" has side effects
; use doseq if you don´t want side-effects
(for [x names] (println x))

; Looping over a list.
;(doseq [n names] (println n))
;(doseq [c cars] (println c))

;(doseq [a addresses] (println a))

(def e { :a "1" } ) ; --> clojure.lang.PersistentArrayMap
(def my-map { :a "1" :b "2" } )

(def ar [1 2 3 4 5 5 "A"])

(def data {
    :genre "fantasy"
    :books [
        { :id 1 :name "Lord of the rings" }
        { :id 2 :name "Game of thrones" }
        { :id 3 :name "Harry potter" }]
    })

(def person {
    :name "George"
    :address {
      :street "5th Street"  
      :number "505"
    }
})

;(-> my-map :a) ; --> "1"
; get a specific value of a data structure
(-> person :address :street) ; --> 5th Street

(let [mybooks (-> person :books)]
  (doseq [b mybooks] println b)) ; --> nil

(defn print-books [books]
  (doseq [b books] print b))

(print-books '(1))

(defn print-name [name]
  (str name))

(print-name "Rod")

;(print-books (->person :books))

;(take 1 c)
;(take 2 c)

;(first c)
;(last c)
