package at.ac.fhcampuswien.fhmdb.builderPattern;

import at.ac.fhcampuswien.fhmdb.models.Genre;

public class MovieAPIRequestBuilder {
    private static final String DELIMITER = "&";

    private StringBuilder sb;
    public MovieAPIRequestBuilder(String url) {
        sb = new StringBuilder(url);
    }
    public MovieAPIRequestBuilder query(String query) {
        if (query != null && !query.isEmpty()) {
            if (!isParamSet()) {
                sb.append("?");
            }
            sb.append("query=").append(query).append(DELIMITER);
        }
        return this;
    }
    public MovieAPIRequestBuilder genre(Genre genre) {
        if (genre != null) {
            if (!isParamSet()) {
                sb.append("?");
            }
            sb.append("genre=").append(genre).append(DELIMITER);
        }
        return this;
    }
    public MovieAPIRequestBuilder releaseYear(String releaseYear) {
        if (releaseYear != null) {
            if (!isParamSet()) {
                sb.append("?");
            }
            sb.append("releaseYear=").append(releaseYear).append(DELIMITER);
        }
        return this;
    }
    public MovieAPIRequestBuilder ratingFrom(String ratingFrom) {
        if (ratingFrom != null) {
            if (!isParamSet()) {
                sb.append("?");
            }
            sb.append("ratingFrom=").append(ratingFrom).append(DELIMITER);
        }
        return this;
    }
    public String build() {
        return sb.toString();
    }
    private boolean isParamSet() {
        return sb.toString().contains("?");
    }
}