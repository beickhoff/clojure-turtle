(ns clojure-turtle.demo
  (:require [clojure-turtle.core :as turtle :include-macros true
             :refer [clean color forward home left right]]
            [clojure-turtle.util
             :refer [beige black blue brown dark-gray dark-green dark-red gray
                     green light-cyan light-pink orange pen-down pen-up pink purple
                     red set-heading straight white yellow]]))
(defonce canvas
  (do
    (.log js/console "Creating turtle")
    (turtle/new-window {:size [650 700]})))
(do
  (clean)
  (home))

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
