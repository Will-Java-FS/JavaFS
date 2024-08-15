import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
//import App from './App.tsx'
import './index.css'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import  Layout  from './pages/layout'
import Home from './pages/home'
import Blogs from './pages/blogs'
import ContactUs from './pages/contact-us'
import PokemonPage from './pages/pokemon'
// import Intro from './components/intro'
// import { Actor } from './components/actor-info'
// import { MovieList } from './components/movie-list'
// import ContactForm from './components/contact-form'
// import Counter from './components/counter'
// import ActorList from './components/actor-list'

// const chris: {name: string, age: number, worth: number} = {
//   name: "Chris Evans",
//   age: 43,
//   worth: 250000000
// };

createRoot(document.getElementById('root')!).render(
  <StrictMode>
     <BrowserRouter>
        <Routes>
          <Route path="/" element={<Layout />}>
            <Route index element={<Home />} />
            <Route path="/blogs" element={<Blogs />} />
            <Route path="/contact-us" element={<ContactUs />} />
            <Route path="pokemon" element={<PokemonPage />} />
          </Route>
        </Routes>
     </BrowserRouter>
     
     {/** 
    <Intro />
    <Actor name = 'Ryan Reynolds' age = {47} worth = {350000000} />
    <Actor name = 'Robert Downy Jr' age = {59} worth = {300000000} />
    <Actor {...chris} />
    <MovieList />
    <ContactForm />
    <Counter />
    <ActorList />*/}
  </StrictMode>,
)
