(ns messages.core
  (:require [reagent.core :as reagent]
            [messages.components.signup :as signup]))

;; Top level app component

(defn app [] [signup/signup])

;; Bootstrap app

(reagent/render-component [app] (.getElementById js/document "app"))
