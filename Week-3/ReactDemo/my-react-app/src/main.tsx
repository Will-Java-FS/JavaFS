import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
//import App from './App.tsx'
import './index.css'
import Intro from './components/intro'
import { Actor } from './components/actor-info'
import { MovieList } from './components/movie-list'
import ContactForm from './components/contact-form'
import Counter from './components/counter'

const chris: {name: string, age: number, worth: number} = {
  name: "Chris Evans",
  age: 43,
  worth: 250000000
};

createRoot(document.getElementById('root')!).render(
  <StrictMode>
    <Intro />
    <Actor name = 'Ryan Reynolds' age = {47} worth = {350000000} />
    <Actor name = 'Robert Downy Jr' age = {59} worth = {300000000} />
    <Actor {...chris} />
    <MovieList />
    <ContactForm />
    <Counter />
  </StrictMode>,
)
