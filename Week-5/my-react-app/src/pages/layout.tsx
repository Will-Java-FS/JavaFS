import { Outlet, Link} from "react-router-dom";

const Layout = () => {
return(
    <>
    <nav>
        <ul>
            <li>
                <Link to="/">Home</Link>
            </li>
            <li>
                <Link to="/blogs">Blogs</Link>
            </li>
            <li>
                <Link to="/contact-us">Contact Us</Link>
            </li>
            <li>
                <Link to="/pokemon">Pokemon</Link>
            </li>
        </ul>
    </nav>

    <Outlet />
    </>
)
}

export default Layout;