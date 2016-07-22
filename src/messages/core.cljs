(ns messages.core
  (:require [reagent.core :as reagent]
            [messages.components.app :as app]
            [messages.data.app-state :as app-state]))

;; Bootstrap app

(reagent/render-component [app/app app-state/app-state]
  (.getElementById js/document "app"))
