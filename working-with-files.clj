(ns fergara.playing-clojure
  "not sure why but defining a namespace is required for require to work properly"
  (:require [clojure.java.io :as io]))

(def content-from-file (slurp "content.txt"))
(println content-from-file)

(def files (.listFiles (io/file ".")))
(doseq [x files] (println x))
(doseq [x files] (println (class x)))

