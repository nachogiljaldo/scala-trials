package com.gilsoft.app.root

import org.scalatra.ScalatraFilter

class RootApp extends ScalatraFilter {
  get("/") {"Hello world!"}
  get("/show") {
    "ey you there!!!!asdfasdf"
  }
}