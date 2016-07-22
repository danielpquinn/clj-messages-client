(ns messages.core
  (:import goog.History)
  (:require [reagent.core :as reagent]
            [secretary.core :as secretary]
            [goog.events :as events]
            [goog.history.EventType :as EventType]
            [messages.components.app :as app]
            [messages.data.app-state :as app-state]
            [messages.routes.user :as user]))

;; Wire up history events using google history object

(doto (History.)
  (events/listen EventType/NAVIGATE #(secretary/dispatch! (.-token %)))
  (.setEnabled true))

;; Configure secretary

(secretary/set-config! :prefix "#")

;; Bootstrap routes

(user/routes app-state/app-state)

;; Bootstrap app

(reagent/render-component [app/app app-state/app-state]
  (.getElementById js/document "app"))
