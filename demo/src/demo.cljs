(ns clojure-turtle.demo
  (:require [clojure-turtle.core :as turtle :include-macros true
             :refer [clean color forward home left right setheading]]
            [clojure-turtle.util :refer [black blue gray green orange purple red white yellow]]))

(defonce canvas
  (do
    (.log js/console "Creating turtle")
    (turtle/new-window {:size [650 700]})))

(clean)
(home)

;(defn r-circle []
;  (doseq [i (range 360)]
;    (forward 1)
;    (right 1)))
;
;(defn l-circle []
;  (doseq [i (range 360)]
;    (forward 1)
;    (left 1)))
;
;(doseq [r (range 0 360 90)]
;  (setheading r)
;  (do (r-circle) (l-circle)))
;

(forward 100)

(color green)
(right 90)
(forward 100)

(color blue)
