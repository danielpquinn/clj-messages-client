(ns messages.data.app-state
 (:require [reagent.core :as reagent]))

;; Default values

(def default-user {
  :username "Username"})

(defn default-page []
  [:div "No page loaded"])

;; Global app state atom

(def app-state (reagent/atom {
  :user default-user
  :page default-page}))
