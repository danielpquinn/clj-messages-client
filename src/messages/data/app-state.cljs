(ns messages.data.app-state
 (:require [reagent.core :as reagent]))

;; Global app state atom

(def app-state (reagent/atom {
  :user {
    :username "Foo"}}))
