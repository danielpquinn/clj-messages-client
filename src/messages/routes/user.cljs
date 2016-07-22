(ns messages.routes.user
  (:require-macros [secretary.core :refer [defroute]])
  (:require [messages.components.signup :as signup]))

;; User route definitions

(defn routes [app-state]
  (defroute "/" []
    (swap! app-state assoc :page signup/signup)))
